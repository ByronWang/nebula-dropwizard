package nebula.define;

import nebula.define.annotation.Auto;
import nebula.define.annotation.IDGenerationStrategy;
import nebula.define.annotation.Immutable;
import nebula.define.annotation.MaxLength;

@MaxLength ( 12)
@Immutable
@Auto
@IDGenerationStrategy ( "native")
public interface ID extends Long {
};