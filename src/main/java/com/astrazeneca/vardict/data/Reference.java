package com.astrazeneca.vardict.data;

import java.util.*;

public class Reference {
    public List<LoadedRegion> loadedRegions;
    public Map<Integer, Character> referenceSequences;
    public Map<String, List<Integer>> seed;

    public Reference() {
        this.loadedRegions = new ArrayList<>();
        this.referenceSequences = new HashMap<>();
        this.seed = new HashMap<>();
    }

    public static class LoadedRegion {
        public String chr;
        public int sequenceStart;
        public int sequenceEnd;

        public LoadedRegion(String chr, int sequenceStart, int sequenceEnd) {
            this.chr = chr;
            this.sequenceStart = sequenceStart;
            this.sequenceEnd = sequenceEnd;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LoadedRegion that = (LoadedRegion) o;
            return sequenceStart == that.sequenceStart &&
                    sequenceEnd == that.sequenceEnd &&
                    Objects.equals(chr, that.chr);
        }

        @Override
        public int hashCode() {
            return Objects.hash(chr, sequenceStart, sequenceEnd);
        }
    }
}
