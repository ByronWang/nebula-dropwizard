package nebula.define;

import nebula.define.Desc;
import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@FormatType ( "image")
@Desc("图片")
@SingleLine
@MaxLength(255)
public interface Image/*|zh:图片*/ extends String {
};