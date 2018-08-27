package org.codechimp.apprater;

public interface ShowController {
    boolean shouldShow(long currentLaunches, long currentTimestamp, int requiredLaunches,
                       long requiredTimestamp);
}
