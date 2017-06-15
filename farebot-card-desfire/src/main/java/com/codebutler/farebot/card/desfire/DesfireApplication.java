/*
 * DesfireApplication.java
 *
 * This file is part of FareBot.
 * Learn more at: https://codebutler.github.io/farebot/
 *
 * Copyright (C) 2011-2012, 2014, 2016 Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
public abstract class DesfireApplication {

    @NonNull
    public static DesfireApplication create(int id, @NonNull List<DesfireFile> files) {
        return new AutoValue_DesfireApplication(id, files);
    }

    public abstract int getId();

    @NonNull
    public abstract List<DesfireFile> getFiles();

    @Nullable
    public DesfireFile getFile(int fileId) {
        for (DesfireFile file : getFiles()) {
            if (file.getId() == fileId) {
                return file;
            }
        }
        return null;
    }
}