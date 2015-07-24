package beast.evolution.speciation;

import beast.core.Citation;
import beast.core.Description;
import beast.evolution.tree.TreeInterface;
import beast.evolution.speciation.SpeciesTreeDistribution;

@Description("Protracted speciation model")

@Citation(value = "Rosindell, James, et al. \"Protracted speciation revitalizes the neutral theory of biodiversity.\" Ecology Letters 13.6 (2010): 716-727.",
        year = 2010,
        firstAuthorSurname = "rosindell")

public class ProtractedModel extends SpeciesTreeDistribution {

    @Override
    public double calculateTreeLogLikelihood(final TreeInterface tree) {
        return ribi.Prime.isPrime(tree.getNodeCount()) ? 1.0 : 0.1;
    }
    
    

}
