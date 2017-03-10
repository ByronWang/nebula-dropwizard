package nebula.define;

import nebula.define.Auto;
import nebula.define.IDGenerationStrategy;
import nebula.define.Immutable;
import nebula.define.Long;
import nebula.define.MaxLength;

@MaxLength ( 12)
@Immutable (true)
@Auto
@IDGenerationStrategy ( "native")
public interface ID extends Long {
};