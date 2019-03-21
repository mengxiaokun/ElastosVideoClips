/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.elastos.videoclips.ui.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v17.leanback.app.GuidedStepFragment;
import android.support.v17.leanback.widget.GuidanceStylist;
import android.support.v17.leanback.widget.GuidanceStylist.Guidance;
import android.support.v17.leanback.widget.GuidedAction;
import android.support.v17.leanback.widget.GuidedActionsStylist;
import android.widget.Toast;

import org.elastos.videoclips.R;

import java.util.List;

/**
 * TODO: Javadoc
 */
public class QRCodeFragment extends GuidedStepFragment {

    private static final int ACTION_ID_POSITIVE = 1;

    @Override
    public GuidanceStylist onCreateGuidanceStylist() {
        return new GuidanceStylist() {
            @Override
            public int onProvideLayoutId() {
                return R.layout.activity_qrcode_example;
            }
        };
    }

    @NonNull
    @Override
    public Guidance onCreateGuidance(Bundle savedInstanceState) {


        Guidance guidance = new Guidance(null,
                null,
                null, getResources().getDrawable(R.drawable.qrcode_samples));
        return guidance;
    }

    @Override
    public void onCreateActions(@NonNull List<GuidedAction> actions, Bundle savedInstanceState) {
        GuidedAction action = new GuidedAction.Builder()
                .id(ACTION_ID_POSITIVE)
                .title(getString(R.string.dialog_example_button_positive)).build();
        actions.add(action);
//        action = new GuidedAction.Builder()
//                .id(ACTION_ID_NEGATIVE)
//                .title(getString(R.string.dialog_example_button_negative)).build();
//        actions.add(action);
    }

    @Override
    public void onGuidedActionClicked(GuidedAction action) {
//        if (ACTION_ID_POSITIVE == action.getId()) {
//            Toast.makeText(getActivity(), R.string.dialog_example_button_toast_positive_clicked,
//                    Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(getActivity(), R.string.dialog_example_button_toast_negative_clicked,
//                    Toast.LENGTH_SHORT).show();
//        }
        getActivity().finish();
    }
}
