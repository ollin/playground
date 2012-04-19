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

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oliver Nautsch
 */
public class TrainFactory {

    Train createTrainA() {

        List<Locomotive> locomotives = new ArrayList<Locomotive>();
        locomotives.add(createCrocodile());

        List<RailroadCar> railroadCars = new ArrayList<RailroadCar>();
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());
        railroadCars.add(createRailroadCarA());

        Train a = new Train();
        a.setLocomotives(locomotives);
        a.setRailroadCars(railroadCars);

        return a;
    }

    /**
     * @see <a href="http://en.wikipedia.org/wiki/Crocodile_(locomotive)">Crocodile locomotive</a>
     */
    public Locomotive createCrocodile() {

        Locomotive crocodile = new Locomotive("crocodile", 100);
        return crocodile;

    }

    public RailroadCar createRailroadCarA() {
        RailroadCar r = new RailroadCar("A", 10);
        return r;
    }
}
