package ru.netology.data.objects

data class Comments(
    var count: Int,                  // количество комментариев
    val canPost: Boolean,             // информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean,       // информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean,              // может ли текущий пользователь закрыть комментарии к записи;
    val canOpen: Boolean                // может ли текущий пользователь открыть комментарии к записи.
)




