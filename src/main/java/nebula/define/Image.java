package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.FormatType;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@FormatType ( "image")
@Desc("图片")
@SingleLine
@MaxLength(255)
public interface Image/*|zh:图片*/ extends String {
};