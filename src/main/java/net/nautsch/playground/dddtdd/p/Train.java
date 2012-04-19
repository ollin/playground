/*
 * Copyright (c) "ollis-playground" Oliver Nautsch
 * http://www.nautsch.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.nautsch.playground.dddtdd.p;

import java.util.List;

/**
 * @author Oliver Nautsch
 */
public class Train {

    private List<Locomotive> locomotives;

    private List<RailroadCar> railroadCars;

    private String name;

    public Train() {
    }

    public Train(String name, List<Locomotive> locomotives, List<RailroadCar> railroadCars) {
        this.locomotives = locomotives;
        this.railroadCars = railroadCars;
        this.name = name;
    }

    public List<Locomotive> getLocomotives() {
        return locomotives;
    }

    public void setLocomotives(List<Locomotive> locomotives) {
        this.locomotives = locomotives;
    }

    public List<RailroadCar> getRailroadCars() {
        return railroadCars;
    }

    public void setRailroadCars(List<RailroadCar> railroadCars) {
        this.railroadCars = railroadCars;
    }
}
