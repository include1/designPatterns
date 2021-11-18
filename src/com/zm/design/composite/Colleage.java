package com.zm.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Colleage extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public Colleage(String name, String desc) {
        super(name, desc);
    }

    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(super.getName() );
        //遍历学院
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
