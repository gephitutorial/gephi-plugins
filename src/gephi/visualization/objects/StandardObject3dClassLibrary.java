/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */

package gephi.visualization.objects;

import gephi.visualization.opengl.AbstractEngine;
import gephi.visualization.opengl.compatibility.CompatibilityEngine;
import gephi.visualization.opengl.compatibility.CompatibilityObject3dClass;
import gephi.visualization.opengl.compatibility.initializer.CompatibilityArrowInitializer;
import gephi.visualization.opengl.compatibility.initializer.CompatibilityEdgeInitializer;
import gephi.visualization.opengl.compatibility.initializer.CompatibilityNodeSphereInitializer;

/**
 *
 * @author Mathieu
 */
public class StandardObject3dClassLibrary implements Object3dClassLibrary
{

    public CompatibilityObject3dClass[] createObjectClassesCompatibility(AbstractEngine engine)
    {
        CompatibilityObject3dClass[] object3dClasses = new CompatibilityObject3dClass[3];

        //NODE
        object3dClasses[0] = new CompatibilityObject3dClass("NODE", true, true);
        object3dClasses[0].addObjectInitializer(new CompatibilityNodeSphereInitializer(engine));

        object3dClasses[1] = new CompatibilityObject3dClass("EDGE", false, false);
        object3dClasses[1].addObjectInitializer(new CompatibilityEdgeInitializer());

        object3dClasses[2] = new CompatibilityObject3dClass("ARROW", true, false);
        object3dClasses[2].addObjectInitializer(new CompatibilityArrowInitializer(engine));
        return object3dClasses;
    }
}
