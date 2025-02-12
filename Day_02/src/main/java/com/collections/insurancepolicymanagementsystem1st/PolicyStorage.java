package com.collections.insurancepolicymanagementsystem1st;

import java.util.*;

public class PolicyStorage {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    //Method to addPolicy
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    //Method to getAllPolicies
    public Set<Policy> getAllPolicies() {
        return hashSet;
    }

    //Method to getSortedPolicies
    public Set<Policy> getSortedPolicies() {
        return treeSet;
    }
}
