package nebula.define;

import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(1200)
@SingleLine
public interface Summary/*|zh:简述 */ extends Text {
};