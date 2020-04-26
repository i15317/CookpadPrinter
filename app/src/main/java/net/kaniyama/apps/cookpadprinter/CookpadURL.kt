package net.kaniyama.apps.cookpadprinter

object CookpadURL {
    val sharedURLHead = "https://cookpad.com/recipe/"
    fun printURL(recipeId: String) = "https://cookpad.com/recipe/print/${recipeId}"
}