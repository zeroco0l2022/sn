package ru.netology

import ru.netology.data.Post
import ru.netology.data.objects.*
import ru.netology.data.objects.Attachments


fun main() {
val attachment = Photo(1, 1, 1, 1, "", 1)
    val attachments = PhotoAttachment(attachment)
    println(attachments.type)

}
