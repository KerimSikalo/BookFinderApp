package ba.etfrma.bookish

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import ba.etfrma.bookish.data.AppDatabase
import ba.etfrma.bookish.data.BookDao
import ba.etfrma.bookish.model.*
import kotlinx.coroutines.runBlocking
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BookDaoInstrumentedTest {

    private lateinit var db: AppDatabase
    private lateinit var dao: BookDao

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java).build()
        dao = db.bookDao()
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun insertAndGetBookWithRelations() = runBlocking {
        val book = BookEntity("1", "Title", "Publisher", "Link", "Desc", "thumb")
        val authors = listOf(Author(1000000,"Author1"))
        val categories = listOf(Category(2000000,"Category1"))

        dao.insertBook(book)
        dao.insertAuthors(authors)
        dao.insertCategories(categories)
        dao.insertBookAuthorCrossRefs(listOf(BookAuthorCrossRef("1", 1000000)))
        dao.insertBookCategoryCrossRefs(listOf(BookCategoryCrossRef("1", 2000000)))

        val result = dao.getBookWithRelations("1")
        Assert.assertEquals("Title", result?.book?.title)
        Assert.assertEquals("Author1", result?.authors?.first()?.name)
        Assert.assertEquals("Category1", result?.categories?.first()?.name)
    }
}
