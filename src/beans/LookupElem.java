package beans;

import com.intellij.codeInsight.lookup.LookupElement;
import org.jetbrains.annotations.NotNull;

public class LookupElem extends com.intellij.codeInsight.lookup.LookupElement {
    private String str;

    public LookupElem(String str) {
        this.str = str;
    }

    @NotNull
    @Override
    public String getLookupString() {
        return this.str;
    }
}
