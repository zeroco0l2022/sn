package ru.netology.service

import ru.netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Long = 1

    fun add(post: Post): Post {
        post.id  = nextId
        posts += post
        nextId++
        return posts.last()
    }

    fun update(updatedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatedPost.id) {
                posts[index] = updatedPost
                return true
            }
        }
        return false
    }

    fun removeById(id: Long): Boolean {
        for (post in posts) {
            if (post.id == id) {
                posts = posts.filter { it != post }.toTypedArray()
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        nextId = 1
    }

    fun likeById(id: Long) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes.copy(count = post.likes.count + 1))
            }
        }
    }
}