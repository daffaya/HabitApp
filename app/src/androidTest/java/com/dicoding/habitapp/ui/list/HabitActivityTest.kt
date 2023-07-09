package com.dicoding.habitapp.ui.list

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dicoding.habitapp.R
import com.dicoding.habitapp.ui.add.AddHabitActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
@RunWith(AndroidJUnit4::class)
class HabitActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(HabitListActivity::class.java)

    @Test
    fun testAddHabitButton() {
        // Click on the "Add Habit" button
        onView(withId(R.id.fab)).perform(click())

        // Check if the AddHabitActivity is displayed
        Intents.intended(IntentMatchers.hasComponent(AddHabitActivity::class.java.name))
    }
}
