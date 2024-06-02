package service

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import ru.netology.data.Post
import ru.netology.service.WallService

class WallServiceTest {

    @Test
    fun testAdd() {
        val service = WallService()
        val result = service.add(Post(ownerId = 111, fromId = 111, createdBy = 111, text = "Text"))
      assertNotEquals(0, result.id)
    }


    @Test
    fun updateExisting() {
        val service = WallService()
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111, text = "Text"))
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111))
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111, text = "Message"))
        val update = Post(1, 111, 111, 111, text = "Updated Text")
        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateExistingFailed() {
        val service = WallService()
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111, text = "Text"))
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111))
        service.add(Post(ownerId = 111, fromId = 111, createdBy = 111, text = "Message"))
        val update = Post(4, 111, 111, 111, text = "Updated Text")
        val result = service.update(update)
        assertFalse(result)
    }

}