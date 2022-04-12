/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage;
import uk.ac.kcl.inf.group19.easySql.easySql.Equation;
import uk.ac.kcl.inf.group19.easySql.easySql.Order;
import uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery;
import uk.ac.kcl.inf.group19.easySql.easySql.TableDeclaration;
import uk.ac.kcl.inf.group19.easySql.easySql.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Select Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getStable <em>Stable</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getSattributes <em>Sattributes</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getSimplecondition <em>Simplecondition</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getRemoveDup <em>Remove Dup</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getOrdertype <em>Ordertype</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SimpleSelectQueryImpl#getSCattributes <em>SCattributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleSelectQueryImpl extends QueryStatementImpl implements SimpleSelectQuery
{
  /**
   * The cached value of the '{@link #getStable() <em>Stable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStable()
   * @generated
   * @ordered
   */
  protected TableDeclaration stable;

  /**
   * The cached value of the '{@link #getSattributes() <em>Sattributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSattributes()
   * @generated
   * @ordered
   */
  protected EList<Value> sattributes;

  /**
   * The cached value of the '{@link #getSimplecondition() <em>Simplecondition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimplecondition()
   * @generated
   * @ordered
   */
  protected EList<Equation> simplecondition;

  /**
   * The cached value of the '{@link #getRemoveDup() <em>Remove Dup</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveDup()
   * @generated
   * @ordered
   */
  protected EList<String> removeDup;

  /**
   * The default value of the '{@link #getOrdertype() <em>Ordertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdertype()
   * @generated
   * @ordered
   */
  protected static final Order ORDERTYPE_EDEFAULT = Order.ASCENDING;

  /**
   * The cached value of the '{@link #getOrdertype() <em>Ordertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdertype()
   * @generated
   * @ordered
   */
  protected Order ordertype = ORDERTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSCattributes() <em>SCattributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSCattributes()
   * @generated
   * @ordered
   */
  protected EList<Value> sCattributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleSelectQueryImpl()
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
    return EasySqlPackage.Literals.SIMPLE_SELECT_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableDeclaration getStable()
  {
    if (stable != null && stable.eIsProxy())
    {
      InternalEObject oldStable = (InternalEObject)stable;
      stable = (TableDeclaration)eResolveProxy(oldStable);
      if (stable != oldStable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE, oldStable, stable));
      }
    }
    return stable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDeclaration basicGetStable()
  {
    return stable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStable(TableDeclaration newStable)
  {
    TableDeclaration oldStable = stable;
    stable = newStable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE, oldStable, stable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Value> getSattributes()
  {
    if (sattributes == null)
    {
      sattributes = new EObjectContainmentEList<Value>(Value.class, this, EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES);
    }
    return sattributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Equation> getSimplecondition()
  {
    if (simplecondition == null)
    {
      simplecondition = new EObjectContainmentEList<Equation>(Equation.class, this, EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION);
    }
    return simplecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getRemoveDup()
  {
    if (removeDup == null)
    {
      removeDup = new EDataTypeEList<String>(String.class, this, EasySqlPackage.SIMPLE_SELECT_QUERY__REMOVE_DUP);
    }
    return removeDup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Order getOrdertype()
  {
    return ordertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrdertype(Order newOrdertype)
  {
    Order oldOrdertype = ordertype;
    ordertype = newOrdertype == null ? ORDERTYPE_EDEFAULT : newOrdertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EasySqlPackage.SIMPLE_SELECT_QUERY__ORDERTYPE, oldOrdertype, ordertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Value> getSCattributes()
  {
    if (sCattributes == null)
    {
      sCattributes = new EObjectContainmentEList<Value>(Value.class, this, EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES);
    }
    return sCattributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES:
        return ((InternalEList<?>)getSattributes()).basicRemove(otherEnd, msgs);
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION:
        return ((InternalEList<?>)getSimplecondition()).basicRemove(otherEnd, msgs);
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES:
        return ((InternalEList<?>)getSCattributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE:
        if (resolve) return getStable();
        return basicGetStable();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES:
        return getSattributes();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION:
        return getSimplecondition();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__REMOVE_DUP:
        return getRemoveDup();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__ORDERTYPE:
        return getOrdertype();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES:
        return getSCattributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE:
        setStable((TableDeclaration)newValue);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES:
        getSattributes().clear();
        getSattributes().addAll((Collection<? extends Value>)newValue);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION:
        getSimplecondition().clear();
        getSimplecondition().addAll((Collection<? extends Equation>)newValue);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__REMOVE_DUP:
        getRemoveDup().clear();
        getRemoveDup().addAll((Collection<? extends String>)newValue);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__ORDERTYPE:
        setOrdertype((Order)newValue);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES:
        getSCattributes().clear();
        getSCattributes().addAll((Collection<? extends Value>)newValue);
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
      case EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE:
        setStable((TableDeclaration)null);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES:
        getSattributes().clear();
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION:
        getSimplecondition().clear();
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__REMOVE_DUP:
        getRemoveDup().clear();
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__ORDERTYPE:
        setOrdertype(ORDERTYPE_EDEFAULT);
        return;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES:
        getSCattributes().clear();
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
      case EasySqlPackage.SIMPLE_SELECT_QUERY__STABLE:
        return stable != null;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SATTRIBUTES:
        return sattributes != null && !sattributes.isEmpty();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SIMPLECONDITION:
        return simplecondition != null && !simplecondition.isEmpty();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__REMOVE_DUP:
        return removeDup != null && !removeDup.isEmpty();
      case EasySqlPackage.SIMPLE_SELECT_QUERY__ORDERTYPE:
        return ordertype != ORDERTYPE_EDEFAULT;
      case EasySqlPackage.SIMPLE_SELECT_QUERY__SCATTRIBUTES:
        return sCattributes != null && !sCattributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (removeDup: ");
    result.append(removeDup);
    result.append(", ordertype: ");
    result.append(ordertype);
    result.append(')');
    return result.toString();
  }

} //SimpleSelectQueryImpl
