package nebula.define;

import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.MinLength;
import nebula.define.String;

@FormatType ( "numeric")
@MaxLength (60)
@MinLength ( 6)
public interface No extends String {
};