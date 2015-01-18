package com.futurice.project.test.device;

import com.futurice.project.MainActivity;
import com.futurice.project.R;
import com.squareup.spoon.Spoon;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

public class BookFragmentTest extends ActivityInstrumentationTestCase2<MainActivity> {
//    private Solo solo;

    public BookFragmentTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
//        solo = new Solo(getInstrumentation(), getActivity());
        super.setUp();
        getActivity();
    }

    public void test_shouldShowBookTitle() throws Exception {
//        TextView titleText = (TextView) solo.getView(R.id.title);
//        assertEquals(View.VISIBLE, titleText.getVisibility());
//        solo.sleep(1000);
//        assertEquals(titleText.getText().toString().startsWith("Biography of"), true);
        onView(withId(R.id.title)).check(matches(isDisplayed()));
        Spoon.screenshot(getActivity(), "TAG");
    }
}
