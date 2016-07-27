package gov.va.vba.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import org.hibernate.annotations.Type;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

/**
 * A user.
 */
@Entity
@Table(schema="BCDSS", name = "SEC_APP_USER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User extends AbstractAuditingEntity implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    @SequenceGenerator(name = "SEQUENCE_GEN", sequenceName = "BCDSS.BCDSS_HIBERNATE_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_GEN")
    private Long id;

    @NotNull
    @Pattern(regexp = "^[a-z0-9]*$")
    @Size(min = 1, max = 50)
    @Column(length = 50, unique = true, nullable = false, name="user_login")
    private String login;

    @JsonIgnore
    @NotNull
    @Size(min = 60, max = 60) 
    @Column(length = 60, name="pswd")
    private String password;

    @Size(max = 50)
    @Column(name = "user_nm", length = 50)
    private String firstName;

    /*@Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;*/

    /*@Email
    @Size(max = 100)
    @Column(length = 100, unique = true)
    private String email;*/

    @Column(nullable = false, name="stas")
    private boolean activated = false;

    /*@Size(min = 2, max = 5)
    @Column(name = "lang_key", length = 5)
    private String langKey;*/

    /*@Size(max = 20)
    @Column(name = "activation_key", length = 20)
    @JsonIgnore
    private String activationKey;*/

    /*@Size(max = 20)
    @Column(name = "reset_key", length = 20)
    private String resetKey;*/

   /* @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "reset_date", nullable = true)
    private DateTime resetDate = null;*/

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            schema="BCDSS", name = "SEC_APP_USER_ROLE",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_role_nm", referencedColumnName = "role_nm")})
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Authority> authorities = new HashSet<>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<PersistentToken> persistentTokens = new HashSet<>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /*public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    /*public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /*public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }*/

    /*public DateTime getResetDate() {
       return resetDate;
    }

    public void setResetDate(DateTime resetDate) {
       this.resetDate = resetDate;
    }*/

    /*public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }*/

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public Set<PersistentToken> getPersistentTokens() {
        return persistentTokens;
    }

    public void setPersistentTokens(Set<PersistentToken> persistentTokens) {
        this.persistentTokens = persistentTokens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (!login.equals(user.login)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                //", lastName='" + lastName + '\'' +
                //", email='" + email + '\'' +
                ", activated='" + activated + '\'' +
                //", langKey='" + langKey + '\'' +
                //", activationKey='" + activationKey + '\'' +
                "}";
    }
}
