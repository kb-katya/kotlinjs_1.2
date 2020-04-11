import kotlin.js.*
import kotlin.browser.document
import kotlin.math.round

fun main() {
    val nowDate = Date()
    val newYearDate = Date(nowDate.getFullYear() + 1, 0, 1)
    val daysUntilNewYear = round((newYearDate.getTime() - nowDate.getTime()) / 86400000)
    document.writeln("Текущая дата: ", "<strong>${nowDate.toLocaleString()}</strong>")
    document.writeln("<br>Дней до нового года: ", "<strong>${daysUntilNewYear}</strong>")
}