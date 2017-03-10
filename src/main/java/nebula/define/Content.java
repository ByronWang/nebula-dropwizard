package nebula.define;

import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(4000)
@FormatType ( "textarea")
@SingleLine
public interface Content extends String {
};