/*
 * Copyright (c) "ollis-playground" Oliver Nautsch
 * http://www.nautsch.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
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

import java.util.Iterator;
import java.util.List;

/**
 * @author Oliver Nautsch
 */
public class TrainCalculator {

    boolean trainIsOkay (Train train) {

        final List<Locomotive> locomotives = train.getLocomotives();

        int power = 0;
        for (Locomotive locomotive : locomotives) {
            power = power + locomotive.getPower();
        }

        final List<RailroadCar> railroadCars = train.getRailroadCars();

        int weight = 0;
        for (RailroadCar railroadCar : railroadCars) {
            weight = weight + railroadCar.getWeight();
        }

        return (power - weight ) > 0;
    }
}
