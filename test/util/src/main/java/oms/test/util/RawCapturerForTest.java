/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: Apache-2.0
 */
package oms.test.util;

import org.webrtc.FileVideoCapturer;

import oms.base.Stream;
import oms.base.VideoCapturer;

import java.io.IOException;

public class RawCapturerForTest extends FileVideoCapturer implements VideoCapturer {

    public RawCapturerForTest(String inputFile) throws IOException {
        super(inputFile);
    }

    @Override
    public int getWidth() {
        // ignored
        return 0;
    }

    @Override
    public int getHeight() {
        // ignored
        return 0;
    }

    @Override
    public int getFps() {
        return 30;
    }

    @Override
    public Stream.StreamSourceInfo.VideoSourceInfo getVideoSource() {
        return Stream.StreamSourceInfo.VideoSourceInfo.RAW_FILE;
    }
}
