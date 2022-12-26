package data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
@AllArgsConstructor
public class DBDetail {
    private int id;
    private String dbName;

    protected boolean canEqual(final Object other) {
        return other instanceof DBDetail;
    }

}
