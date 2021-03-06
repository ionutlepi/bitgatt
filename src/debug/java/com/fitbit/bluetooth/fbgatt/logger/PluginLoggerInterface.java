/*
 *
 *  Copyright 2021 Fitbit, Inc. All rights reserved.
 *
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 */

package com.fitbit.bluetooth.fbgatt.logger;

import com.fitbit.bluetooth.fbgatt.TransactionResult;
import org.json.JSONArray;
import java.util.Map;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Default capabilities of the loggers to be used for displaying output generated by the plugin.
 */
public interface PluginLoggerInterface {
    void logMsg(String msg);

    void log(@NonNull TransactionResult txResult);

    void log(@NonNull TransactionResult txResult, @Nullable String msg);

    void log(@NonNull TransactionResult txResult, @Nullable String successMsg, @Nullable String failureMsg);

    void logSuccess(@Nullable String msg);

    void logError(@Nullable Exception exception);

    void logAsync(@Nullable TransactionResult txResult, @Nullable String msg);

    void logJson(String key, Map<String, Object> map);

    void logJsonResult(String command, String status, String error, JSONArray jsonObject);
}
