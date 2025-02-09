/*
 * Copyright (c) 2019. Fulton Browne
 *  This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.andromeda.ara.util;

public class FullModel {
    public String title;
    public String link;
    public String description;
    public String description2;
    public String image;
    public String[] imageList;

    public FullModel(String title, String link, String description, String image, String description2, String[] imageList) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.description2 = description2;
        this.image = image;
        this.imageList = imageList;
    }
}
