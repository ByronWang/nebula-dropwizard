package nebula.define;

import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(4000)
@FormatType ( "textarea")
@SingleLine
public interface Content extends String {
};