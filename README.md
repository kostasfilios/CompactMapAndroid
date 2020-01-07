# CompactMapAndroid
This is an Android Compact Map similar to Swift compact map. 

With usage of compact map you can use map but with filtered optional values, at this extension over collection we achieve to impelement this functionality 
  
```
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
  ```
