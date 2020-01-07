package example.kostas.compactmap

fun <T, R> Iterable<T>.compactMap(transform: ((T) -> R?)? = null): List<R> {
    var mapedArray = ArrayList<R>()
    for (item in this) {
        val transformedItem = transform?.invoke(item)
        if (transformedItem != null) {
            mapedArray.add(transformedItem)
        }
    }
    return mapedArray
}