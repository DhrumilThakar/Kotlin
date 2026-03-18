object Darts {

    fun score(x: Number, y: Number): Int {
        val dx = x.toDouble()
        val dy = y.toDouble()

        val distanceSquared = dx * dx + dy * dy

        return when {
            distanceSquared <= 1 -> 10
            distanceSquared <= 25 -> 5
            distanceSquared <= 100 -> 1
            else -> 0
        }
    }
}