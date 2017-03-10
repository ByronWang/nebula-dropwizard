package nebula.define;

import nebula.define.Desc;
import nebula.define.FormatType;
import nebula.define.MaxLength;
import nebula.define.Text;

@MaxLength (2000)
@FormatType ( "textarea")
@Desc("多行的文本内容，可以使用Wiki标记")
public interface Help/*|zh:帮助 */ extends Text {
};