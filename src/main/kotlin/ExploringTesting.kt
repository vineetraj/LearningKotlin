import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import java.util.Calendar

class AgeCalculation() {
    fun getAge(dob: Calendar): Int {
//        return 0
        val today = Calendar.getInstance() //today's date
        if (dob.timeInMillis > today.timeInMillis) throw IllegalArgumentException()
        val years =
            today.get(Calendar.YEAR) - dob.get(Calendar.YEAR) //no of days b/w today's date & no of days passed in here
        return if (dob.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR))
            years - 1
        else
            years
    }
}

class AgeCalculationTests() {
    val ageClass = AgeCalculation()

    @Test
    fun checkAgeWhenBornToday() {
        //fail("nope")
        assertEquals(0,ageClass.getAge(Calendar.getInstance()))
    }

    @Test
    fun checkAgeWhenBorn1000DaysAgo() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)

        assertEquals(2, AgeCalculation().getAge(date))
    }

    @Test
    fun testForException() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, +10)

        Assertions.assertThrows(java.lang.IllegalArgumentException::class.java) {
            ageClass.getAge(date)
        }
//        ageClass.getAge(date)
    }
}
