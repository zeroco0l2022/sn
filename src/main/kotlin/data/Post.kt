package ru.netology.data

import ru.netology.data.objects.*


data class Post(

    var id: Long = 0,                                                 // Идентификатор записи.
    val ownerId: Int,                                           // Идентификатор владельца стены, на которой размещена запись
    val fromId: Int = ownerId,                                             // Идентификатор автора записи (от чьего имени опубликована запись).
    val createdBy: Int = ownerId,                                              // Идентификатор администратора, который опубликовал запись
    val date: Int = (System.currentTimeMillis()/1000).toInt(),  // Время публикации записи в формате unixtime.
    val text: String = "",                                      // Текст записи.
    val replyOwnerId: Int? = null,                               // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int? = null,                                   // Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean = false,                           // True если запись была создана с опцией «Только для друзей»
    var postType: Enum<PostType> = PostType.POST,             // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val attachment: Attachments? = null,                         // Массив объектов, соответствующих медиаресурсам, прикреплённым к записи: фотографиям, документам, видеофайлам и другим.
    val geo: Geo? = null,                                     // Информация о местоположении
    val signerId: Int? = null,                                                                       // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val original: Post? = null,
    val likes: Like  = Like(0, userLikes = false, canLike = false, canPublish = false)         // Информация о лайках к записи
)
