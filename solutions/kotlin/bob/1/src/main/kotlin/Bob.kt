object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()

        return when {
            trimmed.isEmpty() -> "Fine. Be that way!"

            trimmed.endsWith("?") && trimmed == trimmed.uppercase() && trimmed.any { it.isLetter() } ->
                "Calm down, I know what I'm doing!"

            trimmed.endsWith("?") -> "Sure."

            trimmed == trimmed.uppercase() && trimmed.any { it.isLetter() } ->
                "Whoa, chill out!"

            else -> "Whatever."
        }
    }
}