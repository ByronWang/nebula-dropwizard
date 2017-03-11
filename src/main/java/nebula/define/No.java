package nebula.define;

import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.MinLength;

@FormatType ( "numeric")
@MaxLength (60)
@MinLength ( 6)
public interface No extends String {
};