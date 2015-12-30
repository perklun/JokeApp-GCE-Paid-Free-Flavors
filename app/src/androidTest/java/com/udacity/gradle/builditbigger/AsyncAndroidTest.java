package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.test.UiThreadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by perklun on 12/27/2015.
 */
public class AsyncAndroidTest extends AndroidTestCase implements EndpointsAsyncTaskListener{

    CountDownLatch countDownLatch;
    String joke;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        countDownLatch = new CountDownLatch(1);
    }

    @UiThreadTest
    public void testAsyncTask() throws InterruptedException {
        new EndpointsAsyncTask(this).execute();
        countDownLatch.await(30, TimeUnit.SECONDS);
        assertNotNull(joke);
    }


    @Override
    public void onJokeRetrievalComplete(String j) {
        countDownLatch.countDown();
        joke = j;
    }
}
