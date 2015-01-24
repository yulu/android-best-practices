package com.futurice.project.test.device.fragments;

import com.futurice.project.MainActivity;
import com.futurice.project.R;
import com.squareup.spoon.Spoon;

import android.test.ActivityInstrumentationTestCase2;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

public class BookFragmentTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public BookFragmentTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void test_shouldShowBookTitle() throws Exception {
        onView(withId(R.id.title)).check(matches(isDisplayed()));
        Spoon.screenshot(getActivity(), "TAG");
    }
}
