package ba.etfrma.bookish

import android.content.ContentResolver
import android.content.ContentValues
import android.net.Uri
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import ba.etfrma.bookish.provider.BookContentProvider
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BookContentProviderTest {

    private lateinit var resolver: ContentResolver

    @Before
    fun setUp() {
        resolver = ApplicationProvider.getApplicationContext<android.content.Context>().contentResolver
    }

    @Test
    fun insertAndQueryBook() {
        val uri = Uri.withAppendedPath(BookContentProvider.CONTENT_URI, "books")
        val values = ContentValues().apply {
            put("id", "b1")
            put("title", "Test Book")
            put("publisher", "Test Publisher")
            put("infoLink", "http://test.com")
            put("description", "Test desc")
            put("thumbnail", "http://img.com")
            put("authors", "Author A,Author B")
            put("categories", "Cat A")
        }

        val resultUri = resolver.insert(uri, values)
        Assert.assertNotNull(resultUri)

        val cursor = resolver.query(
            uri, null, null, null, null
        )
        Assert.assertTrue(cursor?.moveToFirst() == true)
        Assert.assertEquals("Test Book", cursor?.getString(cursor.getColumnIndexOrThrow("title")))
        cursor?.close()
    }
}
