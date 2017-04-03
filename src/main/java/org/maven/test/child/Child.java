package org.maven.test.child;

import org.maven.test.parent.api.Parent;
import org.maven.test.parent.impl.ParentImpl;

public class Child implements Parent {
    Parent p = new ParentImpl();
}
