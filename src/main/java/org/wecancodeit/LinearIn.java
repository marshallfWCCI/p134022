package org.wecancodeit;

public class LinearIn {
    public boolean linearIn(final int[] outer, final int[] inner) {
        // This is *just* for the "both arrays are empty" case.
        if (inner.length == 0)
            return true;

        // outerIndex starts at the first entry in `outer`.
        // For each element in inner, we keep on advancing outerIndex until either
        // 1. We find a match, or
        // 2. we run out of entries in `outer`, in which case we'll eventually return false.
        //
        // Because both lists are sorted, we can just have a single loop and advance outerIndex as necessary
        int outerIndex = 0;
        for (int innerVal : inner) {

            // Note that we always check outerIndex first, so we don't index past the end of the array and crash
            while ((outerIndex < outer.length) && (innerVal != outer[outerIndex]))
                outerIndex++;

        }

        // If outerIndex == outer.length, then we can out of entries in `outer` and so have failed.
        return (outerIndex < outer.length);
    }
}
