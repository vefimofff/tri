package com.wiley;

import com.codepine.api.testrail.TestRail;

/**
 * Interface for connection to TR
 */
public interface ConnectableTr {
    TestRail connect();
}
