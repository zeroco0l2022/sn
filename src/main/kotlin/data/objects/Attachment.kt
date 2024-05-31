package ru.netology.data.objects

class Attachment {
    private var attachments = emptyArray<Attachment>()
    fun add(media: Attachment): Attachment {
        attachments += media
        return attachments.last()
    }
}