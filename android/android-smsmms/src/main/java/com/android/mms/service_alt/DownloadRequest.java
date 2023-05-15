/*
 * Copyright (C) 2015 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.mms.service_alt;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.android.mms.service_alt.exception.MmsHttpException;

/**
 * Request to download an MMS
 */
public class DownloadRequest extends MmsRequest {

    public DownloadRequest(RequestManager requestManager, int subId, String creator, Bundle configOverrides) {
        super(requestManager, subId, creator, configOverrides);
    }

    @Override
    protected byte[] doHttp(Context context, MmsNetworkManager netMgr, ApnSettings apn) throws MmsHttpException {
        return new byte[0];
    }

    @Override
    protected PendingIntent getPendingIntent() {
        return null;
    }

    @Override
    protected int getQueueType() {
        return 0;
    }

    @Override
    protected Uri persistIfRequired(Context context, int result, byte[] response) {
        return null;
    }

    @Override
    protected boolean prepareForHttpRequest() {
        return false;
    }

    @Override
    protected boolean transferResponse(Intent fillIn, byte[] response) {
        return false;
    }

    @Override
    protected void revokeUriPermission(Context context) {

    }
}
