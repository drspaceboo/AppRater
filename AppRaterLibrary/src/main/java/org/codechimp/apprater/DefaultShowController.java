package org.codechimp.apprater;

public class DefaultShowController implements ShowController {
    @Override
    public boolean shouldShow(long currentLaunches, long currentTimestamp, int requiredLaunches,
                              long requiredTimestamp) {
        return currentLaunches >= requiredLaunches || currentTimestamp >= requiredTimestamp;
    }
}
