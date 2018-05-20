package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EndpointsAsyncTaskTestUnit extends EndpointsAsyncTask {

    @Test
    public void iTest() throws InterruptedException, TimeoutException, ExecutionException {

        EndPointAsyncTaskTest aTest =  new EndPointAsyncTaskTest();
        aTest.execute(InstrumentationRegistry.getContext());
        String joke = aTest.get(5, TimeUnit.SECONDS);
        Assert.assertEquals(5,joke.length());

    }


}