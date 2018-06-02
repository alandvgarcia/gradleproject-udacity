package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class EndpointsAsyncTaskTestUnit{

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);

    @Test
    public void teste() {

        EndPointAsyncTaskTest endpointsAsyncTask = new EndPointAsyncTaskTest();

        Assert.assertNotEquals("error", endpointsAsyncTask.doInBackground(mActivityRule.getActivity().getApplicationContext()));

    }


}