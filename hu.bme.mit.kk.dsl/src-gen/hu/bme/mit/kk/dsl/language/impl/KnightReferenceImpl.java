/**
 */
package hu.bme.mit.kk.dsl.language.impl;

import hu.bme.mit.kk.dsl.language.KnightReference;
import hu.bme.mit.kk.dsl.language.LanguagePackage;
import hu.bme.mit.kk.dsl.language.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knight Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kk.dsl.language.impl.KnightReferenceImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnightReferenceImpl extends ExpressionImpl implements KnightReference
{
  /**
   * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerson()
   * @generated
   * @ordered
   */
  protected Person person;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnightReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LanguagePackage.Literals.KNIGHT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getPerson()
  {
    if (person != null && person.eIsProxy())
    {
      InternalEObject oldPerson = (InternalEObject)person;
      person = (Person)eResolveProxy(oldPerson);
      if (person != oldPerson)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LanguagePackage.KNIGHT_REFERENCE__PERSON, oldPerson, person));
      }
    }
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetPerson()
  {
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerson(Person newPerson)
  {
    Person oldPerson = person;
    person = newPerson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.KNIGHT_REFERENCE__PERSON, oldPerson, person));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LanguagePackage.KNIGHT_REFERENCE__PERSON:
        if (resolve) return getPerson();
        return basicGetPerson();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LanguagePackage.KNIGHT_REFERENCE__PERSON:
        setPerson((Person)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.KNIGHT_REFERENCE__PERSON:
        setPerson((Person)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.KNIGHT_REFERENCE__PERSON:
        return person != null;
    }
    return super.eIsSet(featureID);
  }

} //KnightReferenceImpl
